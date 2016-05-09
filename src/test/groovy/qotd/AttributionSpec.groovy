package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Attribution)
class AttributionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid attribution name"() {
    
    	when: 'name is empty'
    	def p = new Attribution(name: '')
    	
    	then: 'validation should fail'
    	!p.validate()
    	
    	when: 'name is null'
    	p = null
    	!p.validate()
    	
    	then: 'validation should fail'
    	thrown(NullPointerException)
    
    	
    	when: 'legal name'
    	p = new Attribution(name: 'Anonymous')
    	
    	then: 'validation should pass'
    	p.validate()
    }
}