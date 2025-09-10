package org.jimike.utility;

import org.jimike.model.ClientRequest;

public class ParamsParser {
    public static ClientRequest parseRequest(String params){

        float xValue = 0.0F, yValue = 0F,rValue = 0F;

        String[] paramsArray = params.split("&");
        for (String c:paramsArray){
            if (c.startsWith("x")){
                xValue = Float.parseFloat(c.split("=")[1]);
            }
            if (c.startsWith("y")){
                yValue = Float.parseFloat(c.split("=")[1]);
            }
            if (c.startsWith("r")){
                rValue = Float.parseFloat(c.split("=")[1]);
            }
        }

        return new ClientRequest(rValue,xValue,yValue);
    }
}