package newqotd

import com.sun.org.apache.xpath.internal.operations.Quo
import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getStaticQuote(){
        return new Quote(author: "Anonymous",
                         content: "Real man no eat Scrapple.")
    }

    Quote getRandomQuote(){
        def allQuotes = Quote.list()
        def randomQuote = null
        if (allQuotes.size()>0){
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]
        }
        else{
            randomQuote = getStaticQuote()
        }
        return randomQuote
    }
}
