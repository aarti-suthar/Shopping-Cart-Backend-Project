package com.Backend.ShoppingCart.DreamShop.service.image;

import com.Backend.ShoppingCart.DreamShop.exceptions.ImageNotFoundException;
import com.Backend.ShoppingCart.DreamShop.model.Image;
import com.Backend.ShoppingCart.DreamShop.repositories.ImageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@AllArgsConstructor
public class ImageService implements IImageService{

    private final ImageRepository imageRepository;
    @Override
    public Image findImageById(Long id) {
        return imageRepository.findById(id).orElseThrow(() -> new ImageNotFoundException("Image Not Found!"));
    }

    @Override
    public void deleteImageById(Long id) {
        imageRepository.findById(id).ifPresentOrElse(imageRepository :: delete,
                () -> {throw new ImageNotFoundException("Image Not Found!");});
    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {

    }
}
