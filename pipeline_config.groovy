allow_scm_jenkinsfile=true
skip_default_checkout=true
merge = true 
override = true 


application_environments {
  global {
     merge = true
     A = "jteconfg A"
     B = "jteconfg B"
  }
}

keywords {
    version = "V1.00"
}

libraries{
  //merge = true 
  //override=true
}

template_methods{
}

