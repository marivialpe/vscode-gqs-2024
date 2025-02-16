import React from 'react'
import Image from 'next/image';
import About from '../../Images/About.jpeg'

const AboutSection = () => {
  return <section className='text-white'><div className='md:grid md:grid-cols-2 gap-8 items-center py-8 px-4 xl:gap-16 sm:py-16 xl:px-16'>
     <Image 
          src={About}
          alt='Abbout'
          className='md:grid md:grid-cols-8 gap-8 items-center py-8 px-4 xl:gap-5 sm:py-20 xl:px-20'
          width={5000}
          height={5000}
          />
    </div>
    </section>
};

export default AboutSection;