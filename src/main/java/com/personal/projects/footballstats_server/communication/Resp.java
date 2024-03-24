package com.personal.projects.footballstats_server.communication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class Resp {

    Logger logger = LoggerFactory.getLogger(Resp.class);

    private String get;
    private List<String> errors;
    private List<String> parameters;
    private int results;
    private Paging paging;
    private List<Map<String, String>> response;

    static class Paging{

        public Paging() {
        }

        int current;
        int total;

        public int getCurrent() {
            return current;
        }

        public Paging setCurrent(int current) {
            this.current = current;
            return this;
        }

        public int getTotal() {
            return total;
        }

        public Paging setTotal(int total) {
            this.total = total;
            return this;
        }
    }

    public Resp() {
    }

    public Resp(String get, List<String> errors, List<String> parameters, int results, Paging paging, List<Map<String, String>> response) {
        this.get = get;
        this.errors = errors;
        this.parameters = parameters;
        this.results = results;
        this.paging = paging;
        this.response = response;
    }

    public String getGet() {
        return get;
    }

    public Resp setGet(String get) {
        this.get = get;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public Resp setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Resp setParameters(List<String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public Paging getPaging() {
        return paging;
    }

    public Resp setPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    public int getResults() {
        return results;
    }

    public Resp setResults(int results) {
        this.results = results;
        return this;
    }

    public List<Map<String, String>> getResponse() {
        return response;
    }

    public Resp setResponse(List<Map<String, String>> response) {
        this.response = response;
        return this;
    }

    @Override
    public String toString() {
        return "Response{" +
                "get='" + get + '\'' +
                ", errors=" + errors +
                ", parameters=" + parameters +
                ", paging current=" + paging.current + ", paging total = " + paging.total +
                '}';
    }
}

