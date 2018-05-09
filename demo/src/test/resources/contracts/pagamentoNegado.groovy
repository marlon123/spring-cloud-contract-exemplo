import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request {
		method 'GET'
		url '/v1/pagamentos/11/status'
	}
	response {
		status 412
		body("""{"aprovado":false}""")
        headers {
            contentType(applicationJson())
        }
    }
}