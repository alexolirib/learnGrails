package learngrails

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CelularSpec extends Specification implements DomainUnitTest<Celular> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
