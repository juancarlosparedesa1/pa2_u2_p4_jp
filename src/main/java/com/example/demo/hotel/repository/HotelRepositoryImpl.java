//package com.example.demo.hotel.repository;
//
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.hotel.repository.modelo.Hotel;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class HotelRepositoryImpl implements IHotelRepository {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public void insertar(Hotel hotel) {
//		// TODO Auto-generated method stub
//		this.entityManager.persist(hotel);
//	}
//
//	@Override
//	public Hotel buscar(Integer id) {
//		// TODO Auto-generated method stub
//		return this.entityManager.find(Hotel.class, id);
//	}
//
//	@Override
//	public void actualizar(Hotel hotel) {
//		// TODO Auto-generated method stub
//		this.entityManager.merge(hotel);
//	}
//
//	@Override
//	public void eliminar(Integer id) {
//		// TODO Auto-generated method stub
//		Hotel hot = this.buscar(id);
//		this.entityManager.remove(hot);
//	}
//
//}
