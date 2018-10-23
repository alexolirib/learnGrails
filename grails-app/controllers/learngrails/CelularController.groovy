package learngrails

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CelularController {

    CelularService celularService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond celularService.list(params), model:[celularCount: celularService.count()]
    }

    def show(Long id) {
        respond celularService.get(id)
    }

    def save(Celular celular) {
        if (celular == null) {
            render status: NOT_FOUND
            return
        }

        try {
            celularService.save(celular)
        } catch (ValidationException e) {
            respond celular.errors, view:'create'
            return
        }

        respond celular, [status: CREATED, view:"show"]
    }

    def update(Celular celular) {
        if (celular == null) {
            render status: NOT_FOUND
            return
        }

        try {
            celularService.save(celular)
        } catch (ValidationException e) {
            respond celular.errors, view:'edit'
            return
        }

        respond celular, [status: OK, view:"show"]
    }

    def delete(Long id) {
        if (id == null) {
            render status: NOT_FOUND
            return
        }

        celularService.delete(id)

        render status: NO_CONTENT
    }
}
