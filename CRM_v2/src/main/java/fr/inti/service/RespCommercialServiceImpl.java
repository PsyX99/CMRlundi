package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.inti.dao.IRespCommercialDAO;
import fr.inti.model.RespCommercial;


@Service
public class RespCommercialServiceImpl implements IRespCommercialService {

	
	@Autowired
	private IRespCommercialDAO resp_commercialDao;
	
	public void setResp_commercialDao(IRespCommercialDAO resp_commercialDao) {
		this.resp_commercialDao=resp_commercialDao;
	}

	@Override
	public void addResp_commercial(RespCommercial resp_commercial) {
		resp_commercialDao.save(resp_commercial);
	}

	@Override
	public void updateResp_commercial(RespCommercial resp_commercial) {
		resp_commercialDao.save(resp_commercial);
	}

	@Override
	public void deleteResp_commercial(RespCommercial resp_commercial) {
		resp_commercialDao.delete(resp_commercial);
	}

	@Override
	public List<RespCommercial> getAllResp_commercial() {
		return (List<RespCommercial>) resp_commercialDao.findAll();
	}

	@Override
	public RespCommercial getResp_commercialById(int id_resp_commercial) {
		return resp_commercialDao.findOne(id_resp_commercial);
	}

}
