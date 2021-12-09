package unirios.prova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unirios.prova.dao.PessoaDao;
import unirios.prova.domain.Pessoa;


@Service
@Transactional(readOnly = false)
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaDao dao;
	
	@Override
	public void salvar(Pessoa pessoa) {
		dao.save(pessoa);
		
	}

	@Override
	public void editar(Pessoa pessoa) {
		dao.update(pessoa);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Pessoa buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pessoa> buscarTodos() {
		return dao.findAll();
	}

}
