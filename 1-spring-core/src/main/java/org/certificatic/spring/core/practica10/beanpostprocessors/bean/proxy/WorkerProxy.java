package org.certificatic.spring.core.practica10.beanpostprocessors.bean.proxy;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.api.IWorker;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = { "proxiedWorker" })
public class WorkerProxy implements IWorker {
	private @Getter @Setter String name;
	private @Getter @Setter int age;

	private @Setter IWorker proxiedWorker;

	public WorkerProxy() {
		System.out.println("[WorkerProxy] Constructing worker proxy.");
	}

	public void init() {
		System.out.println("[WorkerProxy] Initializing worker proxy.");
	}

	public void showInfo() {

		System.out.println("[WorkerProxy] proxying showInfo call...");

		proxiedWorker.showInfo();

		System.out.println("[WorkerProxy] proxying showInfo call (end)...");
	}

	@Override
	public void destroy() {
		System.out.println("[WorkerProxy] Destroying worker proxy.");
	}
}
