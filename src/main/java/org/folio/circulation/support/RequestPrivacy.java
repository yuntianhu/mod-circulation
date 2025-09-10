package org.folio.circulation.support;

import io.vertx.core.json.JsonObject;

public final class RequestPrivacy {
  private void RequestPrvivacy(){}

  public static boolean isAnnoymized (JsonObject requestJson){

    if(requestJson == null) return false;

    final String requestId = requestJson.getString("requesterID");
    final Boolean anonymized = requestJson.getBoolean("anonymized");
    final String anonymizedDate = requestJson.getString("anonymizedDate");

    return requestId == null|| Boolean.TRUE.equals(anonymized) || anonymizedDate != null;


  }
}
