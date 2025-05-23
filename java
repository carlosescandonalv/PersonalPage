document.addEventListener("DOMContentLoaded", function() {
    const container = document.querySelector(".prof_positions");
    const scrollStep = 500; // Scroll step is equal to the width of the .prof_positions element
  
    // Function to scroll left
    document.getElementById("left").addEventListener("click", function() {
      container.scrollBy({
        left: -scrollStep, // Scroll left by the step size
        behavior: "smooth" // Smooth scrolling animation
      });
    });
  
    // Function to scroll right
    document.getElementById("right").addEventListener("click", function() {
      container.scrollBy({
        left: scrollStep, // Scroll right by the step size
        behavior: "smooth" // Smooth scrolling animation
      });
    });
  });
  

  