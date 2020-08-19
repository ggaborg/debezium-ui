package io.debezium.configserver.rest.client;

import io.debezium.configserver.model.ConnectorConfig;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RegisterRestClient
public interface KafkaConnectClient {

    @POST
    @Path("/connectors")
    @Produces("application/json")
    String createConnector(ConnectorConfig configuration);

}
