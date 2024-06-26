package com.israelsantana.demo.models.projection;

import com.israelsantana.demo.models.Action;
import com.israelsantana.demo.models.User;

public interface CalculatorProjection {
    
    public Long getId();

    public User getUser();

    public Action getAction();

    public String getSymbolAction();

    public Double getValueStock();

    public String getDate();
}
