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
            BufferedImage bufferedImage =ImageIO.read(multipartFile.getInputStream()); // ͨ��MultipartFile�õ�InputStream���Ӷ��õ�BufferedImage
            if (bufferedImage == null) {
                // ֤���ϴ����ļ�����ͼƬ����ȡͼƬ��ʧ�ܣ�����������Ĳ���
            }
            imgsize = bufferedImage.getWidth();

           // ʡ���߼��ж�
        } catch (Exception e) {
            // ʡ���쳣����
        	imgsize = 10000;
        }


		logger.info("imgsize : " + imgsize);
		if (imgsize > this.allowedSize) {
			errors.rejectValue("productImage", "com.wego.webstore.validator.ProductImageValidator.message");
		}
	}
	
	
	
	
}
