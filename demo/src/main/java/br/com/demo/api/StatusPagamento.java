package br.com.demo.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusPagamento {
	private Boolean aprovado;

}
