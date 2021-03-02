# Microservices em quarkus rodando no openshift
- Quarkus é uma estrutura para construção de aplicações java Se comparada com ouras como spring boot ou micronau, a primeira diferença é o suporte nativo a executar em plataformas como kubernetes ou openshift.
- Segue os padrões java bem conhecidos como CDI, JAX-RS e microprofile, que também o distingue do spring boot e micronaut.
- Algumas características que podem conversar adotar o quarkus, são:
  - tempo de inicialização
  - mínimo espaço de memória optimizado, para executar em containers

### Exemplo nesse repositório
- Construir uma aplicação baseaa em rest com validação de entrada.
- Comunicação entre microserices com RestClient
- Expor endpoints de saúde
- Expor documentaççao do OpenApi/Swagger
- Teste com rest assured e junit
- Implementar e executar no openshift
