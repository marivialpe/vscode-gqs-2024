import HeroSection from "./components/HeroSection";
import Navbar from "./components/Navbar";
import AboutSection from "./components/AboutSection";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col bg-[#121212]">
      <Navbar />
     <div class="container mt-24 mx-auto px-12 py-4"> {/*para a tela ficar preenchida ate o final, sem as bordas cortadas*/}
       <HeroSection/>
       <AboutSection/>
     </div>
    </main>
  )
}
