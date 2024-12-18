package br.com.aluraspring.screemmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe );
}
