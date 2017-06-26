package fr.inti.service;

import java.util.List;

import fr.inti.model.RespCommercial;

public interface IRespCommercialService {
	
	public void addResp_commercial(RespCommercial resp_commercial);
	public void updateResp_commercial(RespCommercial resp_commercial);
	public void deleteResp_commercial(RespCommercial resp_commercial);
	public List<RespCommercial> getAllResp_commercial();
	public RespCommercial getResp_commercialById(int id_resp_commercial);
}
