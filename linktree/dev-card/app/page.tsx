import { Card, CardBody } from "@nextui-org/card"
import { Chip } from "@nextui-org/chip"
import Image from "next/image"


export default function Home() {
	return (
		<section className="flex flex-col items-center justify-center gap-4 py-8 md:py-10 h-full">
		<Card shadow="lg">
			<CardBody>
				<div className="flex flex-col w-full">
					<div className="flex justify-center">
						<img 
							src="/perfil.png"
							width={200}
							height={200}
							alt="perfil"
							className="justify-center rounded-lg border-large border-secondary"
						
						/>
						</div>
						<div className="flex justify-center">
							<h2 className="text-3x1 font-bold">Mariana Vilela</h2>
						</div>
						<div className="flex justify-center m-4 gap-4">
							<Chip
							variant="shadow"
							color="secondary"
							size="sm"
							>
								Next.js 13	
							</Chip>
							<Chip
							variant="shadow"
							color="secondary"
							size="sm"
							>
								NextUI
							</Chip>
							<Chip
							variant="shadow"
							color="secondary"
							size="sm"
							>
								Programadora	
							</Chip>
						</div>
						<div className="flex justify-center max-w-sm">
							<p className="text-lg text-center font-semibold">
								Atualmente estou cursando Sistemas de Informação e sou desenvolvedora front-end.
							</p>
						</div>
						<div className="flex flex-col justify-center gap-4 pt-4">
							<a href="https://www.linkedin.com/in/mariana-vilela-878b5a236/" target="_blank">
								<Card className="w-full" isHoverable>
									<CardBody className="p-3">
										<h3 className="self-center text-lg">LinkedIn</h3>
									</CardBody>
								</Card>
							</a>
							<a href="https://github.com/marivialpe" target="_blank">
								<Card className="w-full" isHoverable>
									<CardBody className="p-3">
										<h3 className="self-center text-lg">GitHub</h3>
									</CardBody>
								</Card>
							</a>
						</div>
					</div>
			</CardBody>
		</Card>
		</section>

	);
}
