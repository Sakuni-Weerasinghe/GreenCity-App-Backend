package com.greencity.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greencity.app.entity.CollectionCenter;
import com.greencity.app.entity.PickupRequest;
import com.greencity.app.entity.User;

public interface PickupRequestRepository extends JpaRepository<PickupRequest, Integer> {

	PickupRequest findByRequestId(int requestId);

	void deleteByRequestId(int requestId);

	List<PickupRequest> findByCollectionCenter(CollectionCenter collectionCenter);
	
	List<PickupRequest> findByCollectionCenterAndRequestStatus(CollectionCenter collectionCenter, String requestStatus);

	List<PickupRequest> findByUserAndRequestStatus(User user, String requestStatus);
}
