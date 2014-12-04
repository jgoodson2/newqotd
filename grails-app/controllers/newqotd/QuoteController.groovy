package newqotd

class QuoteController {
    static defaultAction = "home"

    def index() { }

    def home(){
        render "<h1>Jonathon Goodson does not know how to program.</h1>"
    }
    def random(){
//        def staticAuthor = "Anonymous"
//        def staticContent = "Jonathon Goodson can't program well."
//        [ author: staticAuthor, content: staticContent]

//        def staticQuote = new Quote(author: 'M. Ali',
//                                    content: 'Float like a butterfly')
//        [quote:staticQuote]

        def allQuotes = Quote.list()
        def randomQuote
        if (allQuotes.size()>0){
            def randomIndex = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIndex]
        }
        else{
            randomQuote = new Quote(author: "Anonymous",
                                    content: "Hello World!")
        }
        [quote:randomQuote]
    }
}
