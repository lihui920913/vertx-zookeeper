package io.vertx.test.core;

import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.spi.cluster.zookeeper.MockZKCluster;

/**
 * Created by stream.Liu
 */
public class ZKClusteredComplexHATest extends ComplexHATest {

  private MockZKCluster zkClustered = new MockZKCluster();

  @Override
  protected ClusterManager getClusterManager() {
    return zkClustered.getClusterManager();
  }
}