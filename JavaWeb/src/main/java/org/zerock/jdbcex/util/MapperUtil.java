package org.zerock.jdbcex.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public enum MapperUtil {
	INSTANCE;
	
	private ModelMapper modelMapper;
	MapperUtil(){
		this.modelMapper = new ModelMapper();
		this.modelMapper.getConfiguration()
			.setFieldMatchingEnabled(true) //이름 같은것끼리 매핑
			.setFieldAccessLevel(org.modelmapper.config. //항목별로
					Configuration.AccessLevel.PRIVATE)
			.setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	public ModelMapper get() {
		return modelMapper;
	}
}
