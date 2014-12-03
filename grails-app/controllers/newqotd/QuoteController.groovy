package newqotd

class QuoteController {
    static defaultAction = "home"

    def index() { }

    def home(){
        render "Jonathon Goodson does not know how to program."
    }
}
