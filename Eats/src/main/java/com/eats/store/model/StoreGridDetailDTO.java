package com.eats.store.model;

import java.util.List;

public class StoreGridDetailDTO {
	
	private int sts_idx;
	private int sg_idx;
	private String sts_location, sts_name;
	private int sts_type_idx, sts_num;
	private List<StoreGridDetailDTO> gridData;
	
	public StoreGridDetailDTO() {
		// TODO Auto-generated constructor stub
	}

	public StoreGridDetailDTO(int sts_idx, int sg_idx, String sts_location, String sts_name, int sts_type_idx, int sts_num) {
		super();
		this.sts_idx = sts_idx;
		this.sg_idx = sg_idx;
		this.sts_location = sts_location;
		this.sts_name = sts_name;
		this.sts_type_idx = sts_type_idx;
		this.sts_num = sts_num;
	}

	public int getSts_idx() {
		return sts_idx;
	}

	public void setSts_idx(int sts_idx) {
		this.sts_idx = sts_idx;
	}

	public int getSg_idx() {
		return sg_idx;
	}

	public void setSg_idx(int sg_idx) {
		this.sg_idx = sg_idx;
	}

	public String getSts_location() {
		return sts_location;
	}

	public void setSts_location(String sts_location) {
		this.sts_location = sts_location;
	}

	public String getSts_name() {
		return sts_name;
	}

	public void setSts_name(String sts_name) {
		this.sts_name = sts_name;
	}

	public int getSts_type_idx() {
		return sts_type_idx;
	}

	public void setSts_type_idx(int sts_type_idx) {
		this.sts_type_idx = sts_type_idx;
	}

	public int getSts_num() {
		return sts_num;
	}

	public void setSts_num(int sts_num) {
		this.sts_num = sts_num;
	}
	
	public List<StoreGridDetailDTO> getGridData() {
		return gridData;
	}

    public void setGridData(List<StoreGridDetailDTO> gridData) {
        this.gridData = gridData;
    }
}
