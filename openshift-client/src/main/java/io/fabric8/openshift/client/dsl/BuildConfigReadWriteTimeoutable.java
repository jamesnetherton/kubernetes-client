package io.fabric8.openshift.client.dsl;

import java.util.concurrent.TimeUnit;

import io.fabric8.kubernetes.client.dsl.Timeoutable;

public interface BuildConfigReadWriteTimeoutable<T> extends Timeoutable<T> {

  T withTimeout(long readTimeout, long writeTimeout, TimeUnit unit);
  T withTimeoutInMillis(long readTimeoutInMillis, long writeTimeoutInMillis);
}
