allow_scm_jenkinsfile = false
skip_default_checkout = true
merge = true 
//override = true 

pipeline_template = "Jenkinsfile2"

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
  merge = true 
  libsimple {
      override = true
      A = "jteconfg A from lib"
   }
 
template_methods{
}

