package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid quote test"() {
    	when 'text is empty'
    	def p = new Quote(text: '')
    	
    	then: 'validation should fail'
    	!p.validate()
    	
    	when 'text is null'
    	p = null
    	
    	then: 'validation should fail'
    	!p.validate()
    	
    	when 'legal text'
    	p = new Quote(text: 'testing 1 2 3')
    	
    	then: 'validation should pass'
    	p.validate()   	
}
