package demo

class UploadRestaurantFeaturedImageService {

    def restaurantGormService

    Restaurant uploadFeatureImage(FeaturedImageCommand cmd) {
        byte[] bytes = cmd.featuredImageFile.bytes
        String contentType = cmd.featuredImageFile.contentType
		String filename = cmd.featuredImageFile.originalFilename //// added
		//restaurantGormService.updateRestaurantFeaturedImage(cmd.id, cmd.version, bytes, contentType)
        restaurantGormService.updateRestaurantFeaturedImage(cmd.id, cmd.version, bytes, contentType, filename)
    }
}
