package newqotd

class QuoteController {
    static defaultAction = "home"

    def index() { }

    def home(){
        render "<h1>Jonathon Goodson does not know how to program.</h1>"
    }
}
