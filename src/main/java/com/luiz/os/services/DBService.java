package com.luiz.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luiz.os.domain.Cliente;
import com.luiz.os.domain.OS;
import com.luiz.os.domain.Tecnico;
import com.luiz.os.domain.enuns.Prioridade;
import com.luiz.os.domain.enuns.Status;
import com.luiz.os.repositories.ClienteRepository;
import com.luiz.os.repositories.OSRepository;
import com.luiz.os.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Luiz Viana", "456.007.243-49", "(85)9888-4628");
		Tecnico t2 = new Tecnico(null, "Alessandro Feitosa", "456.007.243-49", "(85)98877-4628");
		Tecnico t3 = new Tecnico(null, "Jose Maria Feitosa", "456.007.243-49", "(85)9888-4628");
		Cliente c1 = new Cliente(null, "Fabiana Madja", "480.220.633-04", "(85)98826-4627");
		OS os1 = new OS(null, null, Prioridade.ALTA, "OS de teste", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1,t2,t3));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
