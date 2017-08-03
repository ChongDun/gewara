package com.gewara.web.support;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by sunder on 2017/8/3.
 */

public class GewaHttpMessageConverter extends MappingJackson2HttpMessageConverter {
    // ��jsonp��֧�ֵı�ʶ������������мӸò���
    private String callbackName;
    @Override
    protected boolean supports(Class clazz) {
        return false;
    }
    public String getCallbackName() {
        return callbackName;
    }

    public void setCallbackName(String callbackName) {
        this.callbackName = callbackName;
    }

    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {

        return null;
    }

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        // ��threadLocal�л�ȡ��ǰ��Request����
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes()).getRequest();
        String callbackParam = request.getParameter(callbackName);
        if (StringUtils.isEmpty(callbackParam)) {
            // û���ҵ�callback������ֱ�ӷ���json����
            super.writeInternal(object, outputMessage);
        } else {
            JsonEncoding encoding = getJsonEncoding(outputMessage.getHeaders().getContentType());
            try {
                String result = callbackParam + "(" + super.getObjectMapper().writeValueAsString(object)
                        + ");";
                IOUtils.write(result, outputMessage.getBody(), encoding.getJavaName());
            } catch (JsonProcessingException ex) {
                throw new HttpMessageNotWritableException("Could not write JSON: " + ex.getMessage(), ex);
            }
        }
    }
}
