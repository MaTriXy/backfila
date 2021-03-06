package app.cash.backfila.client

object Connectors {
  const val HTTP = "HTTP"
  const val ENVOY = "ENVOY"
}

data class HttpConnectorData(val url: String)

data class EnvoyConnectorData(val clusterType: String)
