package page.custom

class GolfPage extends CustomPageBase {
	static def GOLF = [url: "/products/golf.html", title: "Personalized Golf Labels"]
	
	static url = GOLF.url
	
	static at = {title: startsWith(GOLF.title)}
	
	static content = {

	}
}
