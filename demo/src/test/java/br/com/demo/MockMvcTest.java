package br.com.demo;

import org.junit.Before;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

import br.com.demo.api.PagamentoRestService;

//classe base onde é declarado serviços rest que serão testados e terão stubs gerados
public class MockMvcTest {

    @Before
    public void setup() {
    	//RestAssuredMockMvc.standaloneSetup(new PaymentRestService());
    	RestAssuredMockMvc.standaloneSetup(new PagamentoRestService());
    }
}
