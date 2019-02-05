
  Pod::Spec.new do |s|
    s.name = 'CapacitorLaunchIntent'
    s.version = '0.0.1'
    s.summary = 'Expose Android launch intent.'
    s.license = 'MIT'
    s.homepage = 'https://github.com/goteamup/capacitor-launch-intent'
    s.author = 'TeamUp'
    s.source = { :git => 'https://github.com/goteamup/capacitor-launch-intent', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end