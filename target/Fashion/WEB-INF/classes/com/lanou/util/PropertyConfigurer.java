package com.lanou.util;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

	private Properties props;
	
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {
		// TODO Auto-generated method stub
		super.processProperties(beanFactoryToProcess, props);
		this.props = props;
	}
	
	public String getProperty(String key){
        return this.props.getProperty(key);
    }

    public String getProperty(String key, String defaultValue) {
        return this.props.getProperty(key, defaultValue);
    }

    public Object setProperty(String key, String value) {
        return this.props.setProperty(key, value);
    }
}
