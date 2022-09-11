import React from "react";
import { Outlet, Link } from "react-router-dom";
function AccountSettings() {
  return (
    <>
      <body>
        {/* <!-- Preloader Start Here --> */}
        <div id="preloader"></div>
        {/* <!-- Preloader End Here --> */}
        <div id="wrapper" class="wrapper bg-ash">
          {/* <!-- Header Menu Area Start Here --> */}
          <div class="navbar navbar-expand-md header-menu-one bg-light">
            <div class="navbar-head">
           
        
            </div>
            <div class="d-md-none mobile-nav-bar">
              <button
                class="navbar-toggler pulse-animation"
                type="button"
                data-toggle="collapse"
                data-target="#mobile-navbar"
                aria-expanded="false"
              >
                <i class="far fa-arrow-alt-circle-down"></i>
              </button>
              <button
                type="button"
                class="navbar-toggler sidebar-toggle-mobile"
              >
                <i class="fas fa-bars"></i>
              </button>
            </div>
            <div
              class="header-main-menu collapse navbar-collapse"
              id="mobile-navbar"
            >
              <ul class="navbar-nav"></ul>
              <ul class="navbar-nav">
                <li class="navbar-item dropdown header-admin">
                  <div class="dropdown-menu dropdown-menu-right">
                    <div class="item-header"></div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
          {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
          <div class="dashboard-page-one">
            {/* <!-- Sidebar Area Start Here --> */}
            <div class="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
              <div class="mobile-sidebar-header d-md-none">
                <div class="header-logo">
                  <a href="index.html">
                    <img src="img/logo1.png" alt="logo" />
                  </a>
                </div>
              </div>
              <div class="sidebar-menu-content">
                <ul class="nav nav-sidebar-menu sidebar-toggle-view">
          <li className="nav-item sidebar-nav-item">
                  <Link to="" className="nav-link">
                    <i className="flaticon-classmates"></i>
                    <span>Students</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/all-student.html" className="nav-link">
                        <i className=""></i>All Students
                      </Link>
                    </li>

                    <li className="nav-item">
                      <Link to="/admit-form.html" className="nav-link">
                        <i className=""></i>Admission Form
                      </Link>
                    </li>
                    <li className="nav-item">
                      <Link
                        to="/student-profile-update.html"
                        className="nav-link"
                      >
                        <i className=""></i>Profile Update
                      </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                  <Link to="/" className="nav-link">
                    <i className="flaticon-multiple-users-silhouette"></i>
                    <span>Teachers</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/all-teacher.html" className="nav-link">
                        <i className=""></i>All Teachers
                      </Link>
                    </li>

                    <li className="nav-item">
                      <Link to="/add-teacher.html" className="nav-link">
                        <i className=""></i>Add Teacher
                      </Link>
                    </li>
                    <li className="nav-item">
                      <Link to="/update-profile.html" className="nav-link">
                        <i className=""></i>Profile Update
                      </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item sidebar-nav-item">
                  <Link to="/" className="nav-link">
                    <i className="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i>
                    <span>Class</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/all-class.html" className="nav-link">
                        <i className=""></i>All Classes
                      </Link>
                    </li>
                    <li className="nav-item">
                      <Link to="/add-class" className="nav-link">
                        <i className=""></i>Add New Class
                      </Link>
                    </li>
                  </ul>
                </li>

             

                <li className="nav-item">
                  <Link to="/all-subject.html" className="nav-link">
                    <i className="flaticon-open-book"></i>
                    <span>Subject</span>
                  </Link>
                </li>
                <li className="nav-item">
                  <Link to="/class-routine.html" className="nav-link">
                    <i className="flaticon-calendar"></i>
                    <span>Class Routine</span>
                  </Link>
                </li>
                <li className="nav-item">
                  <Link to="/student-attendence.html" className="nav-link">
                    <i className="flaticon-checklist"></i>
                    <span>Attendence</span>
                  </Link>
                </li>

                <li className="nav-item">
                  <Link to="/account-settings.html" className="nav-link">
                    <i className="flaticon-settings"></i>
                    <span>Account</span>
                  </Link>
                </li>
                </ul>
              </div>
            </div>
            {/* <!-- Sidebar Area End Here --> */}
            <div class="dashboard-content-one">
              {/* <!-- Breadcubs Area Start Here --> */}
              <div class="breadcrumbs-area">
                <h3>Account Setting</h3>
                
              </div>
              {/* <!-- Breadcubs Area End Here -->
                <!-- Account Settings Area Start Here --> */}
              <div class="row">
                <div class="col-12">
                  <div class="card">
                    <div class="card-body">
                      <div class="heading-layout1">
                        <div class="item-title">
                          <h3>Add New User</h3>
                        </div>
                      
                      </div>
                      <form class="new-added-form">
                        <div class="row">
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>First Name *</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Last Name *</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>User Type *</label>
                            <select class="select2">
                              <option value="">Please Select*</option>
                              <option value="1">Super Admin</option>
                              <option value="2">Admin</option>
                              <option value="3">User</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Gender *</label>
                            <select class="select2">
                              <option value="">Please Select Gender *</option>
                              <option value="1">Male</option>
                              <option value="2">Female</option>
                              <option value="3">Others</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Father's Name</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Mother's Name</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Date Of Birth *</label>
                            <input
                              type="text"
                              placeholder="dd/mm/yyyy"
                              class="form-control air-datepicker"
                              data-position="bottom right"
                            />
                            <i class="far fa-calendar-alt"></i>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Religion *</label>
                            <select class="select2">
                              <option value="">Please Select *</option>
                              <option value="1">Islam</option>
                              <option value="2">Christian</option>
                              <option value="3">Hindu</option>
                              <option value="4">Buddhish</option>
                              <option value="5">Others</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Joining Data *</label>
                            <input
                              type="text"
                              placeholder="dd/mm/yyyy"
                              class="form-control air-datepicker"
                              data-position="bottom right"
                            />
                            <i class="far fa-calendar-alt"></i>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>E-Mail</label>
                            <input
                              type="email"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Subject *</label>
                            <select class="select2">
                              <option value="">Please Select*</option>
                              <option value="1">Mathmetics</option>
                              <option value="2">English</option>
                              <option value="3">Chemistry</option>
                              <option value="3">Biology</option>
                              <option value="3">Others</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Class *</label>
                            <select class="select2">
                              <option value="">Please Select Class *</option>
                              <option value="1">Play</option>
                              <option value="2">Nursery</option>
                              <option value="3">One</option>
                              <option value="3">Two</option>
                              <option value="3">Three</option>
                              <option value="3">Four</option>
                              <option value="3">Five</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Section *</label>
                            <select class="select2">
                              <option value="">Please Select Section *</option>
                              <option value="1">Pink</option>
                              <option value="2">Blue</option>
                              <option value="3">Bird</option>
                              <option value="3">Rose</option>
                              <option value="3">Red</option>
                            </select>
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>ID No *</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-xl-3 col-lg-6 col-12 form-group">
                            <label>Phone</label>
                            <input
                              type="text"
                              placeholder=""
                              class="form-control"
                            />
                          </div>
                          <div class="col-lg-6 col-12 form-group">
                            <label>Adress *</label>
                            <textarea
                              class="textarea form-control"
                              name="message"
                              id="form-message"
                              cols="10"
                              rows="4"
                            ></textarea>
                          </div>
                          <div class="col-12 form-group mg-t-8">
                            <button
                              type="submit"
                              class="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                            >
                              Save
                            </button>

                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
                <div class="col-4-xxxl col-xl-5">
                 
                  <div class="col-8-xxxl col-xl-7"></div>
                </div>
                {/* <!-- Account Settings Area End Here --> */}
                <footer class="footer-wrap-layout1"></footer>
              </div>
            </div>
            {/* <!-- Page Area End Here --> */}
          </div>
        </div>
      </body>
    </>
  );
}

export default AccountSettings;
