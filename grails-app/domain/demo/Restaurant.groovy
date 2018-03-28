package demo

class Restaurant {
    String name
    byte[] featuredImageBytes // <1>
    String featuredImageContentType // <2>
	String filename

    static constraints = {
        featuredImageBytes nullable: true
        featuredImageContentType nullable: true
		filename  nullable: true
    }

    static mapping = {
        featuredImageBytes column: 'featured_image_bytes', sqlType: 'longblob' // <3>
    }
}
