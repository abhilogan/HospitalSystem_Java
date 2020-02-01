package com.psl.main;

import java.util.List;
import java.util.Set;

import com.psl.bean.Doctor;
import com.psl.bean.Hospital;
import com.psl.bean.Speciality;
import com.psl.util.HospitalInformationSystemImpl;

public class Client {

	public static void main(String[] args) {
		HospitalInformationSystemImpl implSystemImpl = new HospitalInformationSystemImpl();
		Set<Hospital> setHospital = implSystemImpl.readAllHospital("hospital.ser", "doctor.ser");

		for (Hospital hospital : setHospital) {
			//System.out.println(hospital);
		}

		Set<Doctor> doctors = implSystemImpl.getListOfDoctors(setHospital);

		for (Doctor doctor : doctors) {
			System.out.println(doctor);
		}

		/*
		 * List<Doctor> list; list = implSystemImpl.eligibleForAppointment(setHospital,
		 * Speciality.Dermatologist, 1000);
		 * 
		 * for (Doctor doctor : list) { System.out.println(doctor.getSpeciality() + "\t"
		 * + doctor.getDoctorName() + "\t" + doctor.getExperience() + "\t" +
		 * doctor.getHospitalId()); }
		 * 
		 * List<Doctor> list2; list2 = implSystemImpl.getListWithinHospital(setHospital,
		 * 2003, Speciality.Radiologist, 1000); for (Doctor doctor : list2) {
		 * System.out.println("\n"); System.out.println(doctor.getSpeciality() + "\t" +
		 * doctor.getDoctorName() + "\t" + doctor.getExperience() + "\t" +
		 * doctor.getHospitalId()); }
		 */
	}
}
