package com.wego.webstore.validator;

import java.awt.image.BufferedImage;
import java.math.BigDecimal;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

import com.wego.webstore.domain.Product;

@Component
public class ProductImageValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}
	
	private long allowedSize ;

	public long getAllowedSize() {
		return allowedSize;
	}

	public void setAllowedSize(long allowedSize) {
		this.allowedSize = allowedSize;
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		Logger logger = Logger.getLogger(this.getClass());
		MultipartFile multipartFile = product.getProductImage();
		long imgsize = 0;
		try {
            BufferedImage bufferedImage =ImageIO.read(multipartFile.getInputStream()); // 通过MultipartFile得到InputStream，从而得到BufferedImage
            if (bufferedImage == null) {
                // 证明上传的文件不是图片，获取图片流失败，不进行下面的操作
            }
            imgsize = bufferedImage.getWidth();

           // 省略逻辑判断
        } catch (Exception e) {
            // 省略异常操作
        	imgsize = 10000;
        }


		logger.info("imgsize : " + imgsize);
		if (imgsize > this.allowedSize) {
			errors.rejectValue("productImage", "com.wego.webstore.validator.ProductImageValidator.message");
		}
	}
	
	
	
	
}
