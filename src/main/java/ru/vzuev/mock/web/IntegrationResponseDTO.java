package ru.vzuev.mock.web;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IntegrationResponseDTO {
    public String csedUid;
    public String nsiId;
    public Integer result;
    public String message = "";

    public IntegrationResponseDTO(String csedUid, String nsiId, Integer result, String message) {
        this.csedUid = csedUid;
        this.nsiId = nsiId;
        this.result = result;
        this.message = message;
    }

    public IntegrationResponseDTO(){
        this("", "", -1, "");
    }

    @Override
    public String toString() {
        return "IntegrationResponseDTO{" +
                "csedUid='" + csedUid + '\'' +
                ", nsiId='" + nsiId + '\'' +
                ", result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
