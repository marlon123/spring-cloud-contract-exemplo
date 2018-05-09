import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		url '/v1/pagamentos/1/status'
	}
	response {
		status 200
		body("""{"aprovado":true}""")
        headers {
            contentType(applicationJson())
        }
    }
}