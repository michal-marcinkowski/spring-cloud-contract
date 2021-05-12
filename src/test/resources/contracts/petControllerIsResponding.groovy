import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should got http 200"
    request{
        method GET()
        url("/pets") {

        }
    }
    response {
        status 200
    }
}