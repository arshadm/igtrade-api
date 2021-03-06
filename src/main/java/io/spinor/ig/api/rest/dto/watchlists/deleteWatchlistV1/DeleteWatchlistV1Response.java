package io.spinor.ig.api.rest.dto.watchlists.deleteWatchlistV1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
Delete watchlist response
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteWatchlistV1Response {

/*
Status
*/
private Status status;

public Status getStatus() { return status; }
public void setStatus(Status status) { this.status=status; }
}
