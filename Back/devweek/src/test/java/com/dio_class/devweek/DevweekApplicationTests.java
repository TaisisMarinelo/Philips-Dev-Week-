package com.dio_class.devweek;

import com.dio_class.devweek.Controller.ControllerFaixaEtaria;
import com.dio_class.devweek.Controller.ControllerIncidenciaExame;
import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Entity.IncidenciaExame;
import com.dio_class.devweek.Entity.Regiao;
import org.springframework.http.MediaType;
import com.dio_class.devweek.Controller.ControllerRegiao;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DevweekApplicationTests {

	private final String URL="/api";

	@Autowired
	MockMvc mockMvc;						//

	@Autowired
	private ControllerRegiao controller;

	@Autowired
	private ControllerFaixaEtaria faixa;

	@Autowired
	private ControllerIncidenciaExame incidencia;

	@Autowired
	private ObjectMapper objectMapper; 		//pega o objeto e transforma para JSON


	/*Testes de Regiões*/
	//Get object
	@Test
	public void getControlerTest() throws Exception{
		mockMvc.perform(get(URL+"/regioes")).andExpect(status().isOk());
	}


	//Get object byId
	@Test
	public void getByIdControlerTest() throws Exception{
		mockMvc.perform(get(URL+"/regioes/1")).andExpect(status().isOk());
	}

	//Get object byIdErro
	@Test
	public void getByIdControlerTestErro() throws Exception{
		mockMvc.perform(get(URL+"/regioes/99")).andExpect(status().isNotFound());
	}


	public void addNewRegiaoTest() throws Exception {
		//Long id = Long.valueOf(1);
		Regiao newRegiao =  new Regiao("Centro",57);
		mockMvc.perform(post(URL+"/regioes/insert").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(newRegiao))).andExpect(status().isOk());
	}

	@Test
	public static String asJsonString(final Object obj){
		try {
			return new ObjectMapper().writeValueAsString(obj);
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}


	/*@Test
	public void deleteByIdRegiaoTest() throws Exception {
		Regiao newRegiao1 =  new Regiao("Teste1",66);
		mockMvc.perform(delete(URL+"/regioes/delete/{id}","1").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}*/


	/*Testes de Faixa etaria*/
	//Get object
	@Test
	public void getFaixaTest() throws Exception{
		mockMvc.perform(get(URL+"/faixa-etaria")).andExpect(status().isOk());
	}


	//Get object byId
	@Test
	public void getByIdFaixaTest() throws Exception{
		mockMvc.perform(get(URL+"/faixa-etaria/1")).andExpect(status().isOk());
	}

	//Get object byIdErro
	@Test
	public void getByIdFaixaTestErro() throws Exception{
		mockMvc.perform(get(URL+"/faixa-etaria/22")).andExpect(status().isNotFound());
	}


	public void addNewFaixaTest() throws Exception {
		FaixaEtaria newFaixa =  new FaixaEtaria(155,160,"De 155 a 160 anos");
		mockMvc.perform(post(URL+"/faixa-etaria/insert").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonStringFaixa(newFaixa))).andExpect(status().isOk());
	}

	@Test
	public static String asJsonStringFaixa(final Object obj){
		try {
			return new ObjectMapper().writeValueAsString(obj);
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}

	/*Testes de Incidencia*/
	//Get object
	@Test
	public void getIncidenciaTest() throws Exception{
		mockMvc.perform(get(URL+"/ocorrencias")).andExpect(status().isOk());
	}


	//Get object byId
	@Test
	public void getByIdIncidenciaTest() throws Exception{
		mockMvc.perform(get(URL+"/ocorrencias/1")).andExpect(status().isOk());
	}

	//Get object byIdErro
	@Test
	public void getByIdIncidenciaTestErro() throws Exception{
		mockMvc.perform(get(URL+"/ocorrencias/999999999")).andExpect(status().isNotFound());
	}


	public void addNewIncidenciaTest() throws Exception {
		IncidenciaExame newIncidencia =  new IncidenciaExame(1,6,2L,13);
		mockMvc.perform(post(URL+"/ocorrencias/insert").contentType(MediaType.APPLICATION_JSON)
				.content(asJsonStringInc(newIncidencia))).andExpect(status().isOk());
	}

	@Test
	public static String asJsonStringInc(final Object obj){
		try {
			return new ObjectMapper().writeValueAsString(obj);
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}



}
