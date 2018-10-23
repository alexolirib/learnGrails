package learngrails

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CelularServiceSpec extends Specification {

    CelularService celularService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Celular(...).save(flush: true, failOnError: true)
        //new Celular(...).save(flush: true, failOnError: true)
        //Celular celular = new Celular(...).save(flush: true, failOnError: true)
        //new Celular(...).save(flush: true, failOnError: true)
        //new Celular(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //celular.id
    }

    void "test get"() {
        setupData()

        expect:
        celularService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Celular> celularList = celularService.list(max: 2, offset: 2)

        then:
        celularList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        celularService.count() == 5
    }

    void "test delete"() {
        Long celularId = setupData()

        expect:
        celularService.count() == 5

        when:
        celularService.delete(celularId)
        sessionFactory.currentSession.flush()

        then:
        celularService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Celular celular = new Celular()
        celularService.save(celular)

        then:
        celular.id != null
    }
}
