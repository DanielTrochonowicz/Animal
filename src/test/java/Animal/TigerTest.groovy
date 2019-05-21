package Animal

import spock.lang.Specification

class TigerTest extends Specification {

    def NAME = "tiger"
    def AGE = 5

    def "Creation of tiger"(){
        given: " new tiger with "
        def tiger = new Tiger.TigerBuilder(NAME, AGE).build()

        expect:
        tiger.getName() == NAME
        tiger.getAge() == AGE
    }
    def "Creation of tiger with a blank name"(){
        when:
        def tiger = new Tiger.TigerBuilder("", 5).build()

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Tiger name cannot be null'
    }
}


