package com.Backend.ShoppingCart.DreamShop.service.image;
import com.Backend.ShoppingCart.DreamShop.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {

    Image findImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
